package eki.eve.test.service.db;

import eki.common.test.TestEnvInitialiser;
import eki.eve.service.db.SearchDbService;
import org.jooq.Record4;
import org.jooq.Result;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static com.google.common.truth.Truth.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@TestPropertySource(locations = "classpath:application-test.properties")
@Transactional
public class SearchDbServiceTest {

	@Autowired
	private SearchDbService service;

	@Autowired
	private TestEnvInitialiser testEnvInitialiser;

	@Before
	public void beforeTest() throws Exception {

		testEnvInitialiser.initDatabase();
	}

	@Test
	public void findWords() throws Exception {

		Result<Record4<Long, String, Integer, String>> words = service.findWords("hall");

		assertThat(words).hasSize(2);
		assertThat(words.get(0).value2()).isEqualTo("hall");
		assertThat(words.get(1).value2()).isEqualTo("hall");
	}

	@Test
	public void getWord_finds_existing_word() throws Exception {

		Record4<Long, String, Integer, String> word = service.getWord(10007L);

		assertThat(word.value2()).isEqualTo("hallaudu");
	}

	@Test
	public void getWord_returns_null_if_word_is_not_found() throws Exception {

		Record4<Long, String, Integer, String> word = service.getWord(30003L);

		assertThat(word).isNull();
	}
}