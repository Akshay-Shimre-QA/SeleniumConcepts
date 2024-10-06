package seleniumsessions;

import java.util.Base64;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.BiDi;
import org.openqa.selenium.bidi.module.Network;
import org.openqa.selenium.bidi.network.ResponseData;
import org.openqa.selenium.bidi.network.ResponseDetails;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class SeleniumNetworkTracking {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
//		ChromeDriver driver = new ChromeDriver();
//
//		DevTools devTools = driver.getDevTools();
//		devTools.createSession();
//
//		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//		devTools.addListener(Network.responseReceived(), responseReceived -> {
//            RequestId requestId = responseReceived.getRequestId();
//			Response response = responseReceived.getResponse();
//			String url = response.getUrl();
//			if (url.contains("/contacts")) {
//				System.out.println("API Response received for: " + url);
//				System.out.println("===response=== " + "\n" );
//				System.out.println(response.getStatus() + " " + response.getStatusText());
//				
//                //get the response body
//                Network.GetResponseBodyResponse bodyResponse = devTools.send(Network.getResponseBody(requestId));
//                String responseBody = bodyResponse.getBody();
//                System.out.println("Response body: " + responseBody);
//			}
//		});
		
		//firefox:
		
        // Perform actions
//        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
//        driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("test@123");
//        driver.findElement(By.xpath("//button[@id='submit']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("add-contact")).click();
//
//     
//        
        

		

		//driver.quit();
	}
}
