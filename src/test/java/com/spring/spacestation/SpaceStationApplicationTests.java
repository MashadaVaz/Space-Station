package com.spring.spacestation;

import com.spring.spacestation.controller.SpaceController;
import com.spring.spacestation.model.Location;
import com.spring.spacestation.service.LocationService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.http.MediaType.APPLICATION_JSON;


/////////Latest Testing////////////////////////////////////////////
@RunWith(SpringRunner.class)
//@SpringBootTest
@WebMvcTest(SpaceController.class)
class SpaceStationApplicationTests {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private SpaceController spaceController;

	@MockBean
	private LocationService locationService;

	@Test
	public void getLocationTest() throws Exception {

		mvc.perform(MockMvcRequestBuilders.get("/location")
				.contentType(APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void createLocationObjectTest() {

		Location loc = new Location("Name", 2, 1236, 28374, 237292, 246284, "eclipsed", 12345, 86352, 9484, 93475, 2399, "kilometers");
		assertNotNull(loc);

	}

}

//////////////////////////////////////////////////////////////////////////////////

/*@SpringBootTest
class SpaceStationApplicationTests {

	@Autowired
	private SpaceController spaceController;

	@Autowired
	private Location location;

	@Test
	void getLocationTestObject(){
		assertNotNull(spaceController);
	}

}*/
