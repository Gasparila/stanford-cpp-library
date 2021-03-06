package stanford.spl;

import acm.util.TokenScanner;

class AutograderUnitTest_setTestCounts extends JBECommand {

	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		int passCount = nextInt(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		int testCount = nextInt(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		boolean isStyleCheck = nextBoolean(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		AutograderUnitTestGUI gui = AutograderUnitTestGUI.getInstance(paramJavaBackEnd, isStyleCheck);
		gui.setTestCounts(passCount, testCount);
	}
}
