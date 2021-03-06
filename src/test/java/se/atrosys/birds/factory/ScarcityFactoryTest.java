package se.atrosys.birds.factory;

import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import se.atrosys.birds.BaseTest;
import se.atrosys.birds.model.ScarcityEnum;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by IntelliJ IDEA.
 * User: ola
 * Date: 12/17/11
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ScarcityFactoryTest extends BaseTest {
	@Autowired ScarcityFactory scarcityFactory;
	@Autowired BirdModelListFactory birdModelListFactory;
	Element bird;
	
	@BeforeMethod
	protected void setUp() throws Exception {
		bird = table.child(6);
	}
	
	@Test
	public void shouldGetCorrectScarcityFromElement() {
		ScarcityEnum result = scarcityFactory.getScarcity(bird);
		assertNotNull(result);
		assertEquals(result, ScarcityEnum.RARE_ACCIDENTAL);
	}
}
