package kr.co.sunnyvale.domain;

/**
 * API 관련된 모든 요청들의 Return 을 처리해준다. 
 * Return
 * @return
 * <b>"result"</b> - success, fail <br />
 * <b>"message"</b> - 여차할 때 출력할 수 있는 메시지. Locale 적용 되었기 때문에 Javascript 이것으로 출력하면 된다.  <br />
 * <b>"data"</b> - String 일 수도 있고 Map일 수도 있음. 데이터들을 여기로 보낸다.  
 * 
 * @author Mook
 *
 */
public class JsonResult {

	private String result;
	private String message;
	private Object data;
	
	public JsonResult(boolean resultBoolean, String message, Object data) {
		super();
		if( resultBoolean == true ){
			this.result = "success";
		}else{
			this.result = "fail";
		}
		this.message = message;
		this.data = data;
	}
	
	public JsonResult(String result, String message, Object data) {
		super();
		this.result = result;
		this.message = message;
		this.data = data;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonResult [result=" + result + ", message=" + message
				+ ", data=" + data + "]";
	}
	
}
