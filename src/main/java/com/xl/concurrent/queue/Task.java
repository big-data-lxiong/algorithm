package com.xl.concurrent.queue;

public class Task implements Comparable<Task> {

  private int id;
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Task task) {
    if(this.id > task.id){
      return 1;
    }else if(this.id < task.id){
      return -1;
    } else {
      return 0;
    }
  }
}
