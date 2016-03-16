package kr.co.sunnyvale.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate3.Hibernate3Module;
 
/**
 * JSON 과 하이버네이트 모듈 연결해주는 부분?
 * redwood-servlet.xml 참고
 * @author Mook
 *
 */
public class HibernateAwareObjectMapper extends ObjectMapper {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 459853763970724041L;

	public HibernateAwareObjectMapper() {
        Hibernate3Module hm = new Hibernate3Module();
        registerModule(hm);
    }
}