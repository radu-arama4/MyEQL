package com.company.Data.EmailSpecs;
import com.company.Data.Query;

public class Folder extends Query {
    String folder;

    public Folder(String folder) {
        this.folder = folder;
    }

    public String getfolder() {
        return folder;
    }

    public void setfolder(String folder) {
        this.folder = folder;
    }
}
