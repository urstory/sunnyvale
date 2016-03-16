package kr.co.sunnyvale.util;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

/**
 * 현재 로케일을 가져옴.
 * @author Mook
 *
 */
public class LocaleUtils {
	 public static Locale getLocale() {
	        return LocaleContextHolder.getLocale();
	    }
}
