package ru.vels.taskplanner.dto;

public class ProcessDefinitionDto {

    private String id;
    private String title;
    private String description;
    private String definitionPlan;
    private String owner;
    private boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefinitionPlan() {
        return definitionPlan;
    }

    public void setDefinitionPlan(String definitionPlan) {
        this.definitionPlan = definitionPlan;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
