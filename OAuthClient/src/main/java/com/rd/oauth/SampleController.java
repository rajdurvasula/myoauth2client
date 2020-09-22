package com.rd.oauth;

import org.springframework.web.bind.annotation.Path;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Path("/api")
public class SampleController {

    @PutMapping("/sometask/{taskId}")
    public void updateTaskStatus(@PathVariable String taskId, @RequestBody TaskState taskState) {
        System.out.println("updateTaskStatus: begin");
        System.out.println("Task Id: "+taskId);
        System.out.println("State: "+taskState.getState());
        System.out.println("Work Notes: "+taskState.getWorkNotes());
        System.out.println("updateTaskStatus: end");
    }
}