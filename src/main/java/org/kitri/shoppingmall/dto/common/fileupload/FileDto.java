package org.kitri.shoppingmall.dto.common.fileupload;

import org.springframework.web.multipart.MultipartFile;

public class FileDto {
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
