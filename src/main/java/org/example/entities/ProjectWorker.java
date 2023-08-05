package org.example.entities;

public class ProjectWorker {
    private int projectId;
    private int workerId;

    public int getProjectId() {
        return projectId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public ProjectWorker(int projectId, int workerId) {
        this.projectId = projectId;
        this.workerId = workerId;
    }
}
