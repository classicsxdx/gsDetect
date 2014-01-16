/* Device Detection Controller
 * Intercept User-Agent request & resolve it
 * to return a String letting us know what type of device we are using
http://spring.io/guides/gs/device-detection/

	Jan 15, 2014*/

package hello;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*The controller annotation lets our app know that this is a controller
and should be treated as such.*/

@Controller
public class DeviceDetectionController {

/*		The @ResponseBody anno tells Spring MVC to write the returned object into
		the responseBody instead of sending it to a view (JSP) or something.
		
		Our Device object comes from the imported library above, it intercepts
		the User-Agent in the request header, scans for @Controller, then handles
		the output.*/
	
		@RequestMapping("/detect-device")
		public @ResponseBody String detectDevice(Device device) {
			String deviceType="unknown";
			if (device.isNormal()) {
				deviceType="Normal";
			} else if (device.isMobile()) {
				deviceType="Mobile";
			} else if (device.isTablet()) {
				deviceType="Tablet";
			}
			return "Hello " + deviceType + " browser!";
		}
}
