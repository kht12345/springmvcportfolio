package org.kitri.shoppingmall.controller.exception;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
//	@ExceptionHandler({SQLException.class, DataAccessException.class})
//	public ModelAndView handleSqlException(Exception e) {
//		ModelAndView model = new ModelAndView();
//		model.addObject("result", "작업결과");
//		model.addObject("code", "500");
//		model.addObject("msg", "데이터베이스 작업 중 오류 발생");
//		model.setViewName("login/login");
//		
//		return model;
//	}
	
	@ExceptionHandler({SQLException.class, DataAccessException.class})
	public ResponseEntity<?> handleSqlException(Exception e) {	
		return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
	}
	
}
