package com.zmiter.test.posters.responses;

public class FileUploadResult {

    private int fileId;
    private boolean uploaded;
    private String message;

    public FileUploadResult(int fileId, boolean uploaded, String message) {
        this.fileId = fileId;
        this.uploaded = uploaded;
        this.message = message;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
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
