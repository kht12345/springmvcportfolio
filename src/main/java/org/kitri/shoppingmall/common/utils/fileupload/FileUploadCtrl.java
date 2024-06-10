package org.kitri.shoppingmall.common.utils.fileupload;

import java.io.File;
import java.io.IOException;

import org.kitri.shoppingmall.dto.common.fileupload.FileDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FileUploadCtrl {
	
	private final static String UPLOADPATH = "C:\\eclipse-java-2020-12-R-win32-x86_64\\eclipse\\workspace\\springmvcportfolio\\src\\main\\webapp\\resources\\upload\\";
	
	@RequestMapping(value="/fileuploadpage", method=RequestMethod.GET)
	public String fileUploadForm() {
		return "common/fileupload/fileUpload";
	}
	
	@RequestMapping(value = "/fileupload", method=RequestMethod.POST)
	public String fileUpload( 
		@ModelAttribute FileDto file,
		ModelMap model) throws IOException {
		FileCopyUtils.copy(
			file.getFile().getBytes(), 
			new File(UPLOADPATH + file.getFile().getOriginalFilename()));
		model.addAttribute("filename", file.getFile().getOriginalFilename());
		return "common/fileupload/success";
	}
}
