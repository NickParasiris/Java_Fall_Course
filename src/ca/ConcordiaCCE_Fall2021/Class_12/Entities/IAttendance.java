package ca.ConcordiaCCE_Fall2021.Class_12.Entities;

public interface IAttendance {

    public void signIN();
    public void signOut();
    public boolean isSignedIn();


    // Do's
    // Must be public.
    // It CAN contain constant value.
    // Name it with "I + PascalCase function".
    // Basically contains signatures of methods.
    //
    // Don;t
    // Cannot contain code (implementation of the method).


}
