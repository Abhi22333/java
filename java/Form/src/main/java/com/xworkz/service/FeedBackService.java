package com.xworkz.service;

import com.xworkz.formdto.FeedbackFormDTO;

public interface FeedBackService {

	boolean validateAndSave(FeedbackFormDTO feedBackDTO);
}
