/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author karac
 */
public class Task {
    private int id;
    private String name;
    private String description;
    private String category;
    private String deadline;

    public Task(int id, String name, String description, String category, String deadline) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() { return name; }
    
    public void setName(String name) { 
        this.name = name; }
    
    public String getDescription() { 
        return description; }
    
    public void setDescription(String description) { 
        this.description = description; }
    
    public String getCategory() { 
        return category; }
    
    public void setCategory(String category) { 
        this.category = category; }
    
    public String getDeadline() { 
        return deadline; }
    
    public void setDeadline(String deadline) { 
        this.deadline = deadline; }

    @Override
    public String toString() {
        return name + " (" + category + ") - Deadline: " + deadline;
    }
}
