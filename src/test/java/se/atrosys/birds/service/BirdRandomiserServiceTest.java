package se.atrosys.birds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import se.atrosys.birds.AbstractTest;
import se.atrosys.birds.model.BirdModel;
import se.atrosys.birds.model.PageModel;

/**
 * Created by IntelliJ IDEA.
 * User: ola
 * Date: 12/11/11
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class BirdRandomiserServiceTest extends AbstractTest {
	@Autowired BirdRandomiserService service;
	
	@Test
	public void randomiseBirdShouldReturnValidModel() throws Exception {
		PageModel model = service.randomiseBird(new BirdModel());
	}
}