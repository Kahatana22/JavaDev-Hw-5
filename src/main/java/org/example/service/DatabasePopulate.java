package org.example.service;

import org.example.entities.*;

import java.util.List;
import java.time.LocalDate;


public class DatabasePopulate {
    public static void main(String[] args) {
        DatabasePopulateService populateService = new DatabasePopulateService();
        populateService.createWorker(List.of(
                new Worker("John", LocalDate.of(1998, 6, 23), "Trainee", 800),
                new Worker("Max", LocalDate.of(1993, 2, 15), "Junior", 1200),
                new Worker("Anna", LocalDate.of(1989, 4, 8), "Middle", 2300),
                new Worker("Din", LocalDate.of(1982, 8, 19), "Senior", 5300),
                new Worker("Robert", LocalDate.of(2000, 10, 10), "Trainee", 900),
                new Worker("Mary", LocalDate.of(1993, 1, 4), "Junior", 1300),
                new Worker("David", LocalDate.of(1987, 5, 26), "Middle", 2400),
                new Worker("Barbara", LocalDate.of(1980, 12, 2), "Senior", 5400),
                new Worker("Linda", LocalDate.of(1996, 7, 24), "Trainee", 1000),
                new Worker("Thomas", LocalDate.of(1995, 9, 7), "Junior", 1400)
        ));

        populateService.createClient(List.of(
                new Client("Alex"),
                new Client("Skot"),
                new Client("Luke"),
                new Client("Kevin"),
                new Client("Rayan")
        ));

        populateService.createProject(List.of(
                new Project(1L, LocalDate.of(2022, 2, 17), LocalDate.of(2022, 10, 17)),
                new Project(2L, LocalDate.of(2022, 3, 5), LocalDate.of(2022, 8, 5)),
                new Project(3L, LocalDate.of(2022, 3, 13), LocalDate.of(2023, 1, 13)),
                new Project(1L, LocalDate.of(2022, 4, 2), LocalDate.of(2023, 7, 2)),
                new Project(2L, LocalDate.of(2022,5, 15), LocalDate.of(2023, 3, 15)),
                new Project(3L, LocalDate.of(2022, 6, 1), LocalDate.of(2023, 9, 1)),
                new Project(4L, LocalDate.of(2022, 7, 7), LocalDate.of(2023, 12, 7)),
                new Project(1L, LocalDate.of(2022, 8, 11), LocalDate.of(2024, 2, 11)),
                new Project(3L, LocalDate.of(2022, 10, 4), LocalDate.of(2023, 11, 4)),
                new Project(5L, LocalDate.of(2023, 1, 20), LocalDate.of(2024, 6, 20))
        ));

        populateService.createProjectWorker(List.of(
                new ProjectWorker(3, 1),
                new ProjectWorker(3, 2),
                new ProjectWorker(3, 3),
                new ProjectWorker(4, 4),
                new ProjectWorker(4, 5),
                new ProjectWorker(4, 6),
                new ProjectWorker(5, 9),
                new ProjectWorker(5, 10),
                new ProjectWorker(5, 8),
                new ProjectWorker(6, 7),
                new ProjectWorker(6, 6),
                new ProjectWorker(6, 5),
                new ProjectWorker(7, 4),
                new ProjectWorker(7, 10),
                new ProjectWorker(8, 8),
                new ProjectWorker(8, 9),
                new ProjectWorker(9, 1),
                new ProjectWorker(9, 3),
                new ProjectWorker(10, 2),
                new ProjectWorker(10, 7),
                new ProjectWorker(1, 3),
                new ProjectWorker(1, 1),
                new ProjectWorker(1, 2),
                new ProjectWorker(2, 8),
                new ProjectWorker(2, 10),
                new ProjectWorker(2, 9)
        ));
    }
}