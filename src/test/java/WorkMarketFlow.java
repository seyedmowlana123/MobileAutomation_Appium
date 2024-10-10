import org.testng.annotations.Test;

import CTs.CTs;
import CellRouter.CellRouter;
import Jobs.NonWorkMarket;
import Jobs.WorkMarket;
import Panels.NumberedPanels;
import Power.Power_Panels;
import Resources.BaseTest;
import Submit.Submit;
import Test.TestMeter;
import WrapUp.WrapUp;

public class WorkMarketFlow extends BaseTest{
	
	@Test(priority = 0)
	public void workMarketFlow() {
		WorkMarket wMarket = new WorkMarket(driver,wmUsername, wmPassword);
		wMarket.loginWMUser();
		wMarket.workMarketFlow();
	}

	@Test(priority = 1)
	public void numberedPanelsFlow() {
		NumberedPanels nPanel = new NumberedPanels(driver);
		nPanel.numberedPanelsFlow();
	}

	@Test(priority = 2)
	public void powerFlowWithNumberedPanels() {
		Power_Panels powerPanel = new Power_Panels(driver);
		powerPanel.powerFlowWithNumberedPanels();
	}

	@Test(priority = 3)
	public void CTFlow() {
		CTs cts = new CTs(driver);
		cts.CTFlow();
	}

	@Test(priority = 4)
	public void testFlow() {
		TestMeter testMeter = new TestMeter(driver);
		testMeter.testFlow();
	}

	@Test(priority = 5)
	public void cellRouterFlow() {
		CellRouter cellRouter = new CellRouter(driver);
		cellRouter.cellRouterFlow();
	}

	@Test(priority = 6)
	public void WrapUpFlow() {
		WrapUp wrapUp = new WrapUp(driver);
		wrapUp.WrapUpFlow();
	}

	@Test(priority = 7)
	public void SubmitFlow() {
		Submit submit = new Submit(driver);
		submit.SubmitFlow();
	}

}
