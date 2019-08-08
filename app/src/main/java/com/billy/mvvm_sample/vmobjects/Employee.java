package com.billy.mvvm_sample.vmobjects;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

import com.billy.mvvm_sample.BR;

public class Employee extends BaseObservable {
    private String avatar;
    private String firstName;
    private String lastName;
    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
        isFired.set(false);
    }

    public Employee(String lastName, String firstName, boolean fired){
        this.firstName = firstName;
        this.lastName = lastName;
        isFired.set(fired);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public void setFired(boolean fired) {
        isFired.set(fired);
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
