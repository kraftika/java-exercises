
import java.util.Collection;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.googlecode.fightinglayoutbugs.FightingLayoutBugs;
import com.googlecode.fightinglayoutbugs.LayoutBug;
import com.googlecode.fightinglayoutbugs.WebPage;

public class FightLayout {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		String testUrlPage = "http://www.ryanair.com/";
		driver.get(testUrlPage);

		WebPage webPage = new WebPage(driver);
		
		FightingLayoutBugs fbl = new FightingLayoutBugs();
		final Collection<LayoutBug> layoutBugs = fbl.findLayoutBugsIn(webPage);
		
		System.out.println("Found " + layoutBugs.size() + " layout bug(s).");
        for (LayoutBug bug : layoutBugs) {
            System.out.println(bug);
        }
		driver.quit();
	}
}
