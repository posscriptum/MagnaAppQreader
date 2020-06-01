package com.google.android.gms.samples.vision.barcodereader;

import java.util.Date;

public class Event {
    public int id;
    public String data;
    public String time;
    public int shiftId;
    public int employeeId;
    public int checkpointId;
    public boolean checked;
    public String eventComment;
    public String photo;

    public Event(){ }

    public Event  (String time, int shiftId, int employeeId, int checkpointId, boolean checked, String eventComment, String photo){
        //this.id = id;
        this.data = new Date().toString();
        this.time = time;
        this.shiftId = shiftId;
        this.employeeId = employeeId;
        this.checkpointId = checkpointId;
        this.checked = checked;
        this.eventComment = eventComment;
        this.photo = photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setCheckpointId(int checkpointId) {
        this.checkpointId = checkpointId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setShiftId(int shiftId) {
        this.shiftId = shiftId;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }
}
