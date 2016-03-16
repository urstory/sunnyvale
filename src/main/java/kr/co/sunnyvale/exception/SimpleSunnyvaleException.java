package kr.co.sunnyvale.exception;

public class SimpleSunnyvaleException extends SunnyvaleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9104425422238253732L;

	
	
	public SimpleSunnyvaleException() {
		super();
	}

	public SimpleSunnyvaleException(String messageSourceString) {
		super(messageSourceString);
	}

	@Override
	protected String getDefaultMessageSourceString() {
		return "err.UnknownError";
	}

}
