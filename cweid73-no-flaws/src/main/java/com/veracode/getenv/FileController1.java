package com.veracode.getenv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;

@Controller
public class FileController1 {

    @GetMapping("/delete")
    public String delete(@RequestParam("filename") String filename) throws IOException {
        File f = new File(filename);
        boolean deleted = f.delete();
        if (deleted) {
            return "Deleted";
        } else {
            return "Unable to delete file";
        }
    }
}
