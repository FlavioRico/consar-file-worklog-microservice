package mx.com.multiva.sipare.controller;

import mx.com.multiva.sipare.model.FileWorklog;
import mx.com.multiva.sipare.repository.FileWorklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
public class FileWorklogRestController {

    @Autowired
    private FileWorklogRepository fileWorklogRepository;

    @GetMapping(value = {"/worklogs"})
    public ResponseEntity<FileWorklog> getFileToday() {

        String dispatchDate = new GeneratedDate().getFullDateFormated();
        Optional <FileWorklog> fileWorklogToday = fileWorklogRepository.findById(dispatchDate);
        if(!fileWorklogToday.isPresent())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(fileWorklogToday.get(), HttpStatus.OK);
    }

    @GetMapping(value = {"/worklogs/{dispatchDate}"})
    public ResponseEntity<FileWorklog> getFileByDate(@PathVariable String dispatchDate) {

        Optional <FileWorklog> fileWorklog = fileWorklogRepository.findById(dispatchDate);

        if(!fileWorklog.isPresent())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(fileWorklog.get(), HttpStatus.OK);
    }
}
