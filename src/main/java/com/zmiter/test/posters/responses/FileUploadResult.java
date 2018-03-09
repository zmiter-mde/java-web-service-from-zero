package com.zmiter.test.posters.responses;

public class FileUploadResult {

    private boolean uploaded;
    private String message;

    public FileUploadResult(boolean uploaded, String message) {
        this.uploaded = uploaded;
        this.message = message;
    }

    public boolean isUploaded() {
        return uploaded;
    }

    public void setUploaded(boolean uploaded) {
        this.uploaded = uploaded;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
