package com.codurance.ocp;

public interface IEmployee {

    default int payAmount() {
        return 0;
    }

}
