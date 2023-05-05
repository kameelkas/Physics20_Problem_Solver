
import javax.swing.JOptionPane;

import java.util.Scanner;

public class Physics20ProblemSolver {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] units = { "Kinematics", "Dynamics", "Conservation of Energy", "Oscillatory Motion",
                "Circular Motion and Gravitation", "Mechanical Waves" };
        double kinAns, dynAns, enAns, oscMAns, circAns, mechAns;

        System.out.println("Hello, Welcome to the Physics 20 Problem Solver!");
        System.out.println();
        System.out.println("                           Disclaimer                                     ");
        System.out.println(
                "This program is only able to help studentas with simple 1-2 step, single formula equations.\n All other physics 20 questions such as ones that don't use distinct formulas, graphs etc., are currently\n not able to be calculated using the current version of our program.\n Thank you, and enjoy!");
        System.out.println();
        while (true) {
            System.out.println("Below are a list of the units you can choose from to solve your questions.");
            System.out.println("Please choose the number corresponding with the unit you want.");
            for (int i = 0; i < units.length; i++) {
                System.out.println((i + 1) + " " + units[i]);
            } // end for loop

            int unitsOption;
            unitsOption = numscan.nextInt();
            if (unitsOption == 1) {
                kinAns = kinematics();
                if (kinAns == 0.0) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");// I
                                                                                                                                                                                    // added
                                                                                                                                                                                    // the
                                                                                                                                                                                    // first
                                                                                                                                                                                    // part
                                                                                                                                                                                    // in
                                                                                                                                                                                    // there
                                                                                                                                                                                    // about
                                                                                                                                                                                    // the
                                                                                                                                                                                    // program
                                                                                                                                                                                    // not
                                                                                                                                                                                    // being
                                                                                                                                                                                    // able
                                                                                                                                                                                    // to
                                                                                                                                                                                    // solve
                                                                                                                                                                                    // their
                                                                                                                                                                                    // question,
                                                                                                                                                                                    // because
                                                                                                                                                                                    // for
                                                                                                                                                                                    // example;
                                                                                                                                                                                    // solving
                                                                                                                                                                                    // for
                                                                                                                                                                                    // t
                                                                                                                                                                                    // in
                                                                                                                                                                                    // the
                                                                                                                                                                                    // equation
                                                                                                                                                                                    // 'd=Vit
                                                                                                                                                                                    // +
                                                                                                                                                                                    // 1/2at^2'
                                                                                                                                                                                    // is
                                                                                                                                                                                    // possible
                                                                                                                                                                                    // mathematically,
                                                                                                                                                                                    // but
                                                                                                                                                                                    // solving
                                                                                                                                                                                    // that
                                                                                                                                                                                    // in
                                                                                                                                                                                    // Physics
                                                                                                                                                                                    // 20
                                                                                                                                                                                    // is
                                                                                                                                                                                    // not
                                                                                                                                                                                    // reqired
                                                                                                                                                                                    // and
                                                                                                                                                                                    // that
                                                                                                                                                                                    // would
                                                                                                                                                                                    // be
                                                                                                                                                                                    // hard
                                                                                                                                                                                    // to
                                                                                                                                                                                    // code
                                                                                                                                                                                    // since
                                                                                                                                                                                    // it
                                                                                                                                                                                    // would
                                                                                                                                                                                    // be
                                                                                                                                                                                    // a
                                                                                                                                                                                    // quadratic
                                                                                                                                                                                    // equation
                                                                                                                                                                                    // with
                                                                                                                                                                                    // 2
                                                                                                                                                                                    // possible
                                                                                                                                                                                    // answers.
                } else {
                    JOptionPane.showMessageDialog(null, "Your answer is " + kinAns);
                } // end if statement
            } else if (unitsOption == 2) {
                dynAns = dynamics();
                if (dynAns == 0.0) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your answer is " + dynAns);
                } // end if statement
            } else if (unitsOption == 3) {
                enAns = energy();
                if (enAns == 0.0) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your answer is " + enAns);
                } // end if statement
            } else if (unitsOption == 4) {
                oscMAns = oscMotion();
                if (oscMAns == 0.0) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your answer is " + oscMAns);
                } // end if statement
            } else if (unitsOption == 5) {
                circAns = circMotAndGrav();
                if (circAns == 0.0) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your answer is " + circAns);
                } // end if statement
            } else if (unitsOption == 6) {
                mechAns = mechWaves();
                if (mechAns == 0.0) {
                    JOptionPane.showMessageDialog(null,
                            "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your answer is " + mechAns);
                } // end if statement
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sorry. Either the calculation you are trying to solve is not possible with this current program or the input you gave was invalid. Please try again.");
            } // end big if statement

            System.out.println("Would you like to solve another question?");
            String goAgain;
            goAgain = wordscan.nextLine();
            if (goAgain.contains("y")) {

            } else {
                System.out.println("Thank you for using the program. Hope you enjoyed your experience. Bye Bye!");
                break;
            } // end if statement
        } // end while loop
    }// end main

    public static double kinematics() {
        System.out.println();
        System.out.println("Below are the variables for Kinematic Equations");
        String[] variables = { "v (velocity/speed (m/s))", "d (displacement/distance (m))", "t (time (s))",
                "Vi (initial velocity/speed (m/s))", "Vf (final velocity/speed (m/s))", "a (acceleration (m/s^2))" };
        for (int i = 0; i < variables.length; i++) {
            System.out.println((i + 1) + " " + variables[i]);
        } // end for loop
        int varPick;
        double v, d, t, Vi, Vf, a;
        System.out.println();
        System.out.println("Please enter the numbers of the variables you wish to use (Known and unknown varibales)");
        System.out.println("Please enter as one number, and the numbers in order");
        System.out.println(
                "Example, if you wanted to use the variables 'a' (6), 'v' (1), and 't' (3), then enter as '136'");
        varPick = numscan.nextInt();
        System.out.println();

        if (varPick == 123) {
            System.out.println("The equation for your problem is 'v = d/t'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For d");
            d = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            if (v == 9.9999) {
                return d / t;
            } else if (d == 9.9999) {
                return t * v;
            } else if (t == 9.9999) {
                return d / v;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 136) {
            System.out.println("The equation for your problem is 'a = v/t'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            if (a == 9.9999) {
                return v / t;
            } else if (v == 9.9999) {
                return a * t;
            } else if (t == 9.9999) {
                return v / a;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2346) {
            System.out.println("The equation for your problem is 'd = Vi*t + 1/2*a*t^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For d");
            d = numscan.nextDouble();

            System.out.println("For Vi");
            Vi = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            if (d == 9.9999) {
                return (Vi * t) + (0.5 * a * t * t);
            } else if (Vi == 9.9999) {
                return (d - (0.5 * a * t * t)) / t;
            } else if (a == 9.9999) {
                return (d - (Vi * t)) / (0.5 * t * t);
            } else if (t == 9.9999) {
                return 0.0;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2356) {
            System.out.println("The equation for your problem is 'd = Vf*t - 1/2*a*t^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For d");
            d = numscan.nextDouble();

            System.out.println("For Vf");
            Vf = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            if (d == 9.9999) {
                return (Vf * t) - (0.5 * a * t * t);
            } else if (Vf == 9.9999) {
                return (d + (0.5 * a * t * t)) / t;
            } else if (a == 9.9999) {
                return ((Vf * t) - d) / (0.5 * t * t);
            } else if (t == 9.9999) {
                return 0.0;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2345) {
            System.out.println("The equation for your problem is 'd = [(Vf + Vi)/2]*t'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For d");
            d = numscan.nextDouble();

            System.out.println("For Vf");
            Vf = numscan.nextDouble();

            System.out.println("For Vi");
            Vi = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            if (d == 9.9999) {
                return ((Vf + Vi) / 2) * t;
            } else if (Vi == 9.9999) {
                return ((d / t) * 2) - Vf;
            } else if (Vf == 9.9999) {
                return ((d / t) * 2) - Vi;
            } else if (t == 9.9999) {
                return (2 * d) / (Vf + Vi);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2456) {
            System.out.println("The equation for your problem is 'Vf^2 = Vi^2 + 2*a*d'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For Vf");
            Vf = numscan.nextDouble();

            System.out.println("For Vi");
            Vi = numscan.nextDouble();

            System.out.println("For d");
            d = numscan.nextDouble();

            if (Vf == 9.9999) {
                return Math.sqrt((Vi * Vi) + (2 * a * d));
            } else if (Vi == 9.9999) {
                return Math.sqrt((Vf * Vf) - 2 * a * d);
            } else if (a == 9.9999) {
                return ((Vf * Vf) - (Vi * Vi)) / (2 * d);
            } else if (d == 9.9999) {
                return ((Vf * Vf) - (Vi * Vi)) / (2 * a);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 3456) {
            System.out.println("The equation for your problem is 'a = (Vf - Vi)/t'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For Vf");
            Vf = numscan.nextDouble();

            System.out.println("For Vi");
            Vi = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            if (a == 9.9999) {
                return (Vf - Vi) / t;
            } else if (Vf == 9.9999) {
                return (a * t) + Vi;
            } else if (Vi == 9.9999) {
                return Vf - (a * t);
            } else if (t == 9.9999) {
                return (Vf - Vi) / a;
            } else {
                return 0.0;
            } // end if statement
        } else {
            return 0.0;
        } // end big if statement
    }// end kinematics

    public static double dynamics() {
        System.out.println();
        System.out.println("Below are the variables for Dynanimcs Equations");
        String[] variables = { "Fnet (net force (N))", "m (mass (kg))", "g (gravitational field strength (N/kg))",
                "Ffr (frictional force (N))", "Fn (normal force (N))", "Fa (applied force (N))",
                "Fg (gravitational force (N))", "a (acceleration (m/s^2))", "mu (coefficient of friction)",
                "T (tension (N))" };
        for (int i = 0; i < variables.length; i++) {
            System.out.println((i + 1) + " " + variables[i]);
        } // end for loop
        int varPick;
        double F, m, g, Ffr, Fn, Fa, Fg, a, mu, T;
        System.out.println();
        System.out.println("Please enter the numbers of the variables you wish to use (Known and unknown varibales)");
        System.out.println("Please enter as one number, and the numbers in order");
        System.out.println(
                "Example, if you wanted to use the variables 'm' (2), 'a' (8), and 'Fnet' (1), then enter as '128'");
        varPick = numscan.nextInt();
        System.out.println();

        if (varPick == 128) {
            System.out.println("The equation for your problem is 'Fnet = ma'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fnet");
            F = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            if (F == 9.9999) {
                return m * a;
            } else if (m == 9.9999) {
                return F / a;
            } else if (a == 9.9999) {
                return F / m;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 459) {
            System.out.println("The equation for your problem is 'Ffr = μ*(Fn)'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ffr");
            Ffr = numscan.nextDouble();

            System.out.println("For mu");
            mu = numscan.nextDouble();

            System.out.println("For Fn");
            Fn = numscan.nextDouble();

            if (Ffr == 9.9999) {
                return mu * Fn;
            } else if (mu == 9.9999) {
                return Ffr / Fn;
            } else if (Fn == 9.9999) {
                return Ffr / mu;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 237) {
            System.out.println("The equation for your problem is 'Fg = m*g'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For g");
            g = numscan.nextDouble();

            if (Fg == 9.9999) {
                return m * g;
            } else if (m == 9.9999) {
                return Fg / g;
            } else if (g == 9.9999) {
                return Fg / m;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 12468) {
            System.out.println("The equation for your problem is '(Fnet =) m*a = Fa - Ffr'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For Fa");
            Fa = numscan.nextDouble();

            System.out.println("For Ffr");
            Ffr = numscan.nextDouble();

            if (m == 9.9999) {
                return (Fa - Ffr) / a;
            } else if (a == 9.9999) {
                return (Fa - Ffr) / m;
            } else if (Fa == 9.9999) {
                return (m * a) + Ffr;
            } else if (Ffr == 9.9999) {
                return Fa - (m * a);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2468) {
            System.out.println("The equation for your problem is 'm*a = Fa - Ffr'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For Fa");
            Fa = numscan.nextDouble();

            System.out.println("For Ffr");
            Ffr = numscan.nextDouble();

            if (m == 9.9999) {
                return (Fa - Ffr) / a;
            } else if (a == 9.9999) {
                return (Fa - Ffr) / m;
            } else if (Fa == 9.9999) {
                return (m * a) + Ffr;
            } else if (Ffr == 9.9999) {
                return Fa - (m * a);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 12578) {
            System.out.println("The equation for your problem is '(Fnet =) m*a = Fn - Fg'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For Fn");
            Fn = numscan.nextDouble();

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            if (m == 9.9999) {
                return (Fn - Fg) / a;
            } else if (a == 9.9999) {
                return (Fn - Fg) / m;
            } else if (Fn == 9.9999) {
                return (m * a) + Fg;
            } else if (Fg == 9.9999) {
                return Fn - (m * a);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2578) {
            System.out.println("The equation for your problem is 'm*a = Fn - Fg'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For Fn");
            Fn = numscan.nextDouble();

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            if (m == 9.9999) {
                return (Fn - Fg) / a;
            } else if (a == 9.9999) {
                return (Fn - Fg) / m;
            } else if (Fn == 9.9999) {
                return (m * a) + Fg;
            } else if (Fg == 9.9999) {
                return Fn - (m * a);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 127810) {
            System.out.println("The equation for your problem is '(Fnet =) m*a = T - Fg'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            if (m == 9.9999) {
                return (T - Fg) / a;
            } else if (a == 9.9999) {
                return (T - Fg) / m;
            } else if (T == 9.9999) {
                return (m * a) + Fg;
            } else if (Fg == 9.9999) {
                return T - (m * a);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 27810) {
            System.out.println("The equation for your problem is 'm*a = T - Fg'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For a");
            a = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            if (m == 9.9999) {
                return (T - Fg) / a;
            } else if (a == 9.9999) {
                return (T - Fg) / m;
            } else if (T == 9.9999) {
                return (m * a) + Fg;
            } else if (Fg == 9.9999) {
                return T - (m * a);
            } else {
                return 0.0;
            } // end if statement
        } else {
            return 0.0;
        } // end big if statement
    }// end dynamics

    public static double energy() {
        System.out.println();
        System.out.println("Below are the variables for Conservation of Energy Equations");
        String[] variables = { "W (work (J))", "F (force (N))", "d (displacement/distance (m))",
                "costheta (angle of cos (if applicable) (degrees))", "Ek (kinetic energy (J))",
                "Ep (potential energy (J))", "Et (total energy (J))", "H (heat energy (if applicable) (J))",
                "m (mass (kg))", "v (velocity/speed (m/s))", "g (gravitational field strength (N/kg))",
                "h (height (vertical only) (m))", "P (power (W))", "t (time (s))", "k (spring constant (N/m))",
                "x (spring displacement (m))", "Fs (spring force (N))" };
        for (int i = 0; i < variables.length; i++) {
            System.out.println((i + 1) + " " + variables[i]);
        } // end for loop
        int varPick;
        double W, F, d, costheta, Ek, Ep, Et, H, m, v, g, h, P, t, k, x, Fs;
        System.out.println();
        System.out.println("Please enter the numbers of the variables you wish to use (Known and unknown varibales)");
        System.out.println("Please enter as one number, and the numbers in order");
        System.out.println(
                "Example, if you wanted to use the variables 'm' (9), 'g' (11), 'h' (12) and 'Ep' (6), then enter as '691112'");
        varPick = numscan.nextInt();
        System.out.println();

        if (varPick == 123) {
            System.out.println("The equation for your problem is 'W = F*d'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For W");
            W = numscan.nextDouble();

            System.out.println("For F");
            F = numscan.nextDouble();

            System.out.println("For d");
            d = numscan.nextDouble();

            if (W == 9.9999) {
                return F * d;
            } else if (d == 9.9999) {
                return W / F;
            } else if (F == 9.9999) {
                return W / d;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 1234) {
            System.out.println("The equation for your problem is 'W = F*d*cosθ'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For W");
            W = numscan.nextDouble();

            System.out.println("For F");
            F = numscan.nextDouble();

            System.out.println("For d");
            d = numscan.nextDouble();

            System.out.println("Value of the theta(angle)");
            costheta = numscan.nextDouble();

            if (W == 9.9999) {
                return F * d * Math.cos(costheta);
            } else if (F == 9.9999) {
                return W / (d * costheta);
            } else if (d == 9.9999) {
                return W / (F * costheta);
            } else if (costheta == 9.9999) {
                return Math.toDegrees(Math.acos(W / (F * d)));
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 11314) {
            System.out.println("The equation for your problem is 'P = W/t'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For P");
            P = numscan.nextDouble();

            System.out.println("For W");
            W = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            if (P == 9.9999) {
                return W / t;
            } else if (W == 9.9999) {
                return P * t;
            } else if (t == 9.9999) {
                return W / P;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 151617) {
            System.out.println("The equation for your problem is 'Fs = -k*x'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fs");
            Fs = numscan.nextDouble();

            System.out.println("For k");
            k = numscan.nextDouble();

            System.out.println("For x");
            x = numscan.nextDouble();

            if (Fs == 9.9999) {
                return k * x;
            } else if (k == 9.9999) {
                return Fs / x;
            } else if (x == 9.9999) {
                return Fs / k;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 5910) {
            System.out.println("The equation for your problem is 'Ek = 1/2*m*v^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ek");
            Ek = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For v");
            v = numscan.nextDouble();

            if (Ek == 9.9999) {
                return 0.5 * m * v * v;
            } else if (m == 9.9999) {
                return Ek / (0.5 * v * v);
            } else if (v == 9.9999) {
                return Math.sqrt(Ek / (m * 0.5));
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 691112) {
            System.out.println("The equation for your problem is 'Ep = m*g*h'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ep");
            Ep = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For g");
            g = numscan.nextDouble();

            System.out.println("For h");
            h = numscan.nextDouble();

            if (Ep == 9.9999) {
                return m * g * h;
            } else if (m == 9.9999) {
                return Ep / (g * h);
            } else if (g == 9.9999) {
                return Ep / (m * h);
            } else if (h == 9.9999) {
                return Ep / (m * g);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 61516) {
            System.out.println("The equation for your problem is 'Ep = 1/2*k*x^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ep");
            Ep = numscan.nextDouble();

            System.out.println("For k");
            k = numscan.nextDouble();

            System.out.println("For x");
            x = numscan.nextDouble();

            if (Ep == 9.9999) {
                return 0.5 * k * x * x;
            } else if (k == 9.9999) {
                return Ep / (0.5 * x * x);
            } else if (x == 9.9999) {
                return Math.sqrt(Ep / (k * 0.5));
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 567) {
            System.out.println("The equation for your problem is 'Et = Ek + Ep'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ep");
            Ep = numscan.nextDouble();

            System.out.println("For Ek");
            Ek = numscan.nextDouble();

            System.out.println("For Et");
            Et = numscan.nextDouble();

            if (Ep == 9.9999) {
                return Et - Ek;
            } else if (Et == 9.9999) {
                return Ep + Ek;
            } else if (Ek == 9.9999) {
                return Et - Ep;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 5678) {
            System.out.println("The equation for your problem is 'Et = Ep + Ek + H'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ep");
            Ep = numscan.nextDouble();

            System.out.println("For Ek");
            Ek = numscan.nextDouble();

            System.out.println("For Et");
            Et = numscan.nextDouble();

            System.out.println("For H");
            H = numscan.nextDouble();

            if (Et == 9.9999) {
                return Ek + Ep + H;
            } else if (Ek == 9.9999) {
                return Et - Ep - H;
            } else if (Ep == 9.9999) {
                return Et - Ek - H;
            } else if (H == 9.9999) {
                return Et - Ep - Ek;
            } else {
                return 0.0;
            } // end if statement
        } else {
            return 0.0;
        } // end big if statement
    }// end energy

    public static double oscMotion() {
        System.out.println();
        System.out.println("Below are the variables for Oscillatory Motion Equations");
        String[] variables = { "T (period (s))", "f (frequency (Hz))", "m (mass (kg))", "k (spring constant (N/m))",
                "l (length (to centre of bob) (m))", "g (acceleration due to gravity (m/s^2)", "Fs (spring force (N))",
                "x (spring displacement (m))", "Ep (potential spring energy (J))" };
        for (int i = 0; i < variables.length; i++) {
            System.out.println((i + 1) + " " + variables[i]);
        } // end for loop
        int varPick;
        double T, f, m, k, l, g, Fs, x, Ep;
        System.out.println();
        System.out.println("Please enter the numbers of the variables you wish to use (Known and unknown varibales)");
        System.out.println("Please enter as one number, and the numbers in order");
        System.out.println(
                "Example, if you wanted to use the variables 'm' (3), 'k' (4), and 'T' (1), then enter as '134'");
        varPick = numscan.nextInt();
        System.out.println();

        if (varPick == 12) {
            System.out.println("The equation for your problem is 'T = 1/f'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For f");
            f = numscan.nextDouble();

            if (T == 9.9999) {
                return 1 / f;
            } else if (f == 9.9999) {
                return 1 / T;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 134) {
            System.out.println("The equation for your problem is 'T = 2*π*Square Root((m/k))'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For k");
            k = numscan.nextDouble();

            if (T == 9.9999) {
                return 2 * Math.PI * Math.sqrt((m / k));
            } else if (m == 9.9999) {
                return (k * T * T) / (4 * Math.PI * Math.PI);
            } else if (k == 9.9999) {
                return (4 * Math.PI * Math.PI * m) / (T * T);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 156) {
            System.out.println("The equation for your problem is 'T = 2*π*Square Root((l/g))'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For l");
            l = numscan.nextDouble();

            System.out.println("For g");
            g = numscan.nextDouble();

            if (T == 9.9999) {
                return 2 * Math.PI * Math.sqrt((l / g));
            } else if (l == 9.9999) {
                return (g * T * T) / (4 * Math.PI * Math.PI);
            } else if (g == 9.9999) {
                return (4 * Math.PI * Math.PI * l) / (T * T);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 478) {
            System.out.println("The equation for your problem is 'Fs = -k*x'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fs");
            Fs = numscan.nextDouble();

            System.out.println("For k");
            k = numscan.nextDouble();

            System.out.println("For x");
            x = numscan.nextDouble();

            if (Fs == 9.9999) {
                return k * x;
            } else if (k == 9.9999) {
                return Fs / x;
            } else if (x == 9.9999) {
                return Fs / k;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 489) {
            System.out.println("The equation for your problem is 'Ep = 1/2*k*x^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Ep");
            Ep = numscan.nextDouble();

            System.out.println("For k");
            k = numscan.nextDouble();

            System.out.println("For x");
            x = numscan.nextDouble();

            if (Ep == 9.9999) {
                return 0.5 * k * x * x;
            } else if (k == 9.9999) {
                return Ep / (0.5 * x * x);
            } else if (x == 9.9999) {
                return Math.sqrt(Ep / (k * 0.5));
            } else {
                return 0.0;
            } // end if statement
        } else {
            return 0.0;
        } // end big if statement
    }// end oscMotion

    public static double circMotAndGrav() {
        System.out.println();
        System.out.println("Below are the variables for Circular Motion and Gravitation Equations");
        String[] variables = { "ac (centripetal acceleration (m/s^2))", "v (tangential/centripetal velocity (m/s))",
                "r (radius/distance between centre of two masses (m))", "T (period (s))", "m (mass (kg))",
                "Fc (centripetal force (N))", "Fg (gravitational force/force of attrraction between two masses (N))",
                "G (gravitational constant (Nm^2/kg^2))", "m1 (first mass/mass inside the field - test mass (kg)",
                "m2 (second mass/mass creating the field - source mass (kg))", "me (mass of Earth (kg))",
                "g (gravitational field (N/kg))" };
        for (int i = 0; i < variables.length; i++) {
            System.out.println((i + 1) + " " + variables[i]);
        } // end for loop
        int varPick;
        double ac, v, r, T, m, Fc, Fg, G, m1, m2, me, g;
        System.out.println();
        System.out.println("Please enter the numbers of the variables you wish to use (Known and unknown varibales)");
        System.out.println();
        System.out.println(
                "Note. If you want to use scientific notification to print extremely large numers (numbers that have 10 to the power of) please use 'E' or 'e' as the 'to the power of' button.");
        System.out.println("Example; '1.32 x 10 to the power of 22' would be entered as; '1.32E22' or '1.32e22'");
        System.out.println();
        System.out.println("Please enter as one number, and the numbers in order");
        System.out.println(
                "Example, if you wanted to use the variables 'Fc' (6), 'v' (2), 'm' (5), and 'r' (3), then enter as '2356'");
        varPick = numscan.nextInt();
        System.out.println();

        if (varPick == 123) {
            System.out.println("The equation for your problem is 'ac = v^2/r'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For ac");
            ac = numscan.nextDouble();

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (ac == 9.9999) {
                return (v * v) / r;
            } else if (v == 9.9999) {
                return Math.sqrt((ac * r));
            } else if (r == 9.9999) {
                return (v * v) / ac;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 134) {
            System.out.println("The equation for your problem is 'ac = 4*pi^2r/T^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For ac");
            ac = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            if (ac == 9.9999) {
                return (4 * Math.PI * Math.PI * r) / (T * T);
            } else if (T == 9.9999) {
                return Math.sqrt(((4 * Math.PI * Math.PI * r) / ac));
            } else if (r == 9.9999) {
                return (ac * T * T) / (4 * Math.PI * Math.PI);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2356) {
            System.out.println("The equation for your problem is 'Fc = m*v^2/r'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fc");
            Fc = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (Fc == 9.9999) {
                return (m * v * v) / r;
            } else if (m == 9.9999) {
                return (Fc * r) / (v * v);
            } else if (v == 9.9999) {
                return Math.sqrt(((Fc * r) / m));
            } else if (r == 9.9999) {
                return (m * v * v) / Fc;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 3456) {
            System.out.println("The equation for your problem is 'Fc = 4*pi^2rm/T^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For Fc");
            Fc = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            if (Fc == 9.9999) {
                return (4 * Math.PI * Math.PI * r * m) / (T * T);
            } else if (m == 9.9999) {
                return (Fc * T * T) / (4 * Math.PI * Math.PI * r);
            } else if (r == 9.9999) {
                return (Fc * T * T) / (4 * Math.PI * Math.PI * m);
            } else if (T == 9.9999) {
                return Math.sqrt(((4 * Math.PI * Math.PI * r * m) / Fc));
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 234) {
            System.out.println("The equation for your problem is 'v = 2*pi*r/T'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            if (v == 9.9999) {
                return (2 * Math.PI * r) / T;
            } else if (r == 9.9999) {
                return (T * v) / (2 * Math.PI);
            } else if (T == 9.9999) {
                return (2 * Math.PI * r) / v;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 378910) {
            System.out.println("The equation for your problem is 'Fg = G*m1*m2/r^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For G");
            G = numscan.nextDouble();

            System.out.println("For m1");
            m1 = numscan.nextDouble();

            System.out.println("For m2");
            m2 = numscan.nextDouble();

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (Fg == 9.9999) {
                return (G * m1 * m2) / (r * r);
            } else if (r == 9.9999) {
                return Math.sqrt(((G * m1 * m2) / Fg));
            } else if (G == 9.9999) {
                return (Fg * r * r) / (m1 * m2);
            } else if (m1 == 9.9999) {
                return (Fg * r * r) / (G * m2);
            } else if (m2 == 9.9999) {
                return (Fg * r * r) / (m1 * G);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 7912) {
            System.out.println("The equation for your problem is 'g = Fg/m1'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            System.out.println("For g");
            g = numscan.nextDouble();

            System.out.println("For m1");
            m1 = numscan.nextDouble();

            if (g == 9.9999) {
                return Fg / m1;
            } else if (m1 == 9.9999) {
                return Fg / g;
            } else if (Fg == 9.9999) {
                return m1 * g;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 5712) {
            System.out.println("The equation for your problem is 'g = Fg/m'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For Fg");
            Fg = numscan.nextDouble();

            System.out.println("For g");
            g = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            if (g == 9.9999) {
                return Fg / m;
            } else if (m == 9.9999) {
                return Fg / g;
            } else if (Fg == 9.9999) {
                return m * g;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 381012) {
            System.out.println("The equation for your problem is 'g = G*m2/r^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For g");
            g = numscan.nextDouble();

            System.out.println("For G");
            G = numscan.nextDouble();

            System.out.println("For m2");
            m2 = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (g == 9.9999) {
                return (G * m2) / (r * r);
            } else if (G == 9.9999) {
                return (g * r * r) / m2;
            } else if (m2 == 9.9999) {
                return (g * r * r) / G;
            } else if (r == 9.9999) {
                return Math.sqrt(((G * m2) / g));
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 35812) {
            System.out.println("The equation for your problem is 'g = G*m/r^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For g");
            g = numscan.nextDouble();

            System.out.println("For G");
            G = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (g == 9.9999) {
                return (G * m) / (r * r);
            } else if (G == 9.9999) {
                return (g * r * r) / m;
            } else if (m == 9.9999) {
                return (g * r * r) / G;
            } else if (r == 9.9999) {
                return Math.sqrt(((G * m) / g));
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 23811) {
            System.out.println("The equation for your problem is 'v = Square root((G*me/r))'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For G");
            G = numscan.nextDouble();

            System.out.println("For me");
            me = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (v == 9.9999) {
                return Math.sqrt(((G * me) / r));
            } else if (G == 9.9999) {
                return (r * v * v) / me;
            } else if (me == 9.9999) {
                return (r * v * v) / G;
            } else if (r == 9.9999) {
                return (G * me) / (v * v);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 2358) {
            System.out.println("The equation for your problem is 'v = Square root((G*m/r))'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For G");
            G = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For r");
            r = numscan.nextDouble();

            if (v == 9.9999) {
                return Math.sqrt(((G * m) / r));
            } else if (G == 9.9999) {
                return (r * v * v) / m;
            } else if (m == 9.9999) {
                return (r * v * v) / G;
            } else if (r == 9.9999) {
                return (G * m) / (v * v);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 34811) {
            System.out.println("The equation for your problem is 'r^3/T^2 = G*me/4*pi^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For r");
            r = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For me");
            me = numscan.nextDouble();

            System.out.println("For G");
            G = numscan.nextDouble();

            if (r == 9.9999) {
                return Math.cbrt((G * me * T * T) / (4 * Math.PI * Math.PI));
            } else if (T == 9.9999) {
                return Math.sqrt((r * r * r * 4 * Math.PI * Math.PI) / (G * me));
            } else if (me == 9.9999) {
                return (r * r * r * 4 * Math.PI * Math.PI) / (G * T * T);
            } else if (G == 9.9999) {
                return (r * r * r * 4 * Math.PI * Math.PI) / (me * T * T);
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 3458) {
            System.out.println("The equation for your problem is 'r^3/T^2 = G*m/4*pi^2'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For r");
            r = numscan.nextDouble();

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For m");
            m = numscan.nextDouble();

            System.out.println("For G");
            G = numscan.nextDouble();

            if (r == 9.9999) {
                return Math.cbrt((G * m * T * T) / (4 * Math.PI * Math.PI));
            } else if (T == 9.9999) {
                return Math.sqrt((r * r * r * 4 * Math.PI * Math.PI) / (G * m));
            } else if (m == 9.9999) {
                return (r * r * r * 4 * Math.PI * Math.PI) / (G * T * T);
            } else if (G == 9.9999) {
                return (r * r * r * 4 * Math.PI * Math.PI) / (m * T * T);
            } else {
                return 0.0;
            } // end if statement
        } else {
            return 0.0;
        } // end big if statement
    }// end circMotAndGrav

    public static double mechWaves() {
        System.out.println();
        System.out.println("Below are the variables for Mechanical Waves Equations");
        String[] variables = { "v (speed of the sound wave (m/s))", "lam ((lamda) wavelength of the wave (m))",
                "f (frequency of the wave (Hz))", "T (period (s))", "d (distance (m))", "t (time (s))",
                "M (Mach number (Mach variable))", "Va (speed of aircraft (Mach variable) (m/s))",
                "Vsa (speed of sound at the altitude aircraft is flying at (Mach variable) (m/s))",
                "L (length (of tube or string) (m))",
                "fs (frequency emmitted by the source (Doppler Effect variable) (Hz))",
                "vs (speed of the source (Doppler Effect variable) (m/s))",
                "fo (frequency detected by obvserver (Doppler Effect variable) (Hz))",
                "v1 (speed of the sound wave (Doppler Effect variable) (m/s))" };
        for (int i = 0; i < variables.length; i++) {
            System.out.println((i + 1) + " " + variables[i]);
        } // end for loop
        int varPick;
        double v, lam, f, T, d, t, M, Va, Vsa, L, fs, vs, fo, v1;
        System.out.println();
        System.out.println("Please enter the numbers of the variables you wish to use (Known and unknown varibales)");
        System.out.println("Please enter as one number, and the numbers in order");
        System.out.println("Example, if you wanted to use the variables 'f' (3), and 'T' (4), then enter as '34'");
        varPick = numscan.nextInt();
        System.out.println();

        if (varPick == 156) {
            System.out.println("The equation for your problem is 'v = d/t'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For d");
            d = numscan.nextDouble();

            System.out.println("For t");
            t = numscan.nextDouble();

            if (v == 9.9999) {
                return d / t;
            } else if (d == 9.9999) {
                return t * v;
            } else if (t == 9.9999) {
                return d / v;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 123) {
            System.out.println("The equation for your problem is 'v = f*lam'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For v");
            v = numscan.nextDouble();

            System.out.println("For lam");
            lam = numscan.nextDouble();

            System.out.println("For f");
            f = numscan.nextDouble();

            if (v == 9.9999) {
                return lam * f;
            } else if (lam == 9.9999) {
                return v / f;
            } else if (f == 9.9999) {
                return v / lam;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 34) {
            System.out.println("The equation for your problem is 'T = 1/f'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For T");
            T = numscan.nextDouble();

            System.out.println("For f");
            f = numscan.nextDouble();

            if (T == 9.9999) {
                return 1 / f;
            } else if (f == 9.9999) {
                return 1 / T;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 789) {
            System.out.println("The equation for your problem is 'M = Va/Vsa'");
            System.out.println(
                    "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

            System.out.println("For M");
            M = numscan.nextDouble();

            System.out.println("For Va");
            Va = numscan.nextDouble();

            System.out.println("For Vsa");
            Vsa = numscan.nextDouble();

            if (M == 9.9999) {
                return Va / Vsa;
            } else if (Va == 9.9999) {
                return Vsa * M;
            } else if (Vsa == 9.9999) {
                return Va / M;
            } else {
                return 0.0;
            } // end if statement
        } else if (varPick == 210) {
            int tubeChoice, frequencyChoice;
            System.out.println("The equation for your problem is a variation of 'L = ()*lam'");
            System.out.println(
                    "Would you like to solve this resonance question for a; \n1. Open Tube\n2. Closed Tube\n3. Stretched String\nPlease type in the corresponding number with the choice you want.");

            tubeChoice = numscan.nextInt();
            if (tubeChoice == 1) {
                System.out.println(
                        "Would you like to use the equation for;  \n1. Fundamental Frequency\n2. 1st Overtone \n3. 2nd Overtone\nPlease type in the corresponding number with the choice you want.");
                frequencyChoice = numscan.nextInt();
                if (frequencyChoice == 1) {
                    System.out.println("The specific equation for your problem is 'L = 1/2*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 0.5 * lam;
                    } else if (lam == 9.9999) {
                        return L / 0.5;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else if (frequencyChoice == 2) {
                    System.out.println("The specific equation for your problem is 'L = 2/2*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 1 * lam;
                    } else if (lam == 9.9999) {
                        return L / 1;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else if (frequencyChoice == 3) {
                    System.out.println("The specific equation for your problem is 'L = 3/2*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 1.5 * lam;
                    } else if (lam == 9.9999) {
                        return L / 1.5;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else {
                    return 0.0;
                } // end frequency choice of statement
            } else if (tubeChoice == 2) {
                System.out.println(
                        "Would you like to use the equation for;  \n1. Fundamental Frequency\n2. 1st Overtone \n3. 2nd Overtone\nPlease type in the corresponding number with the choice you want.");
                frequencyChoice = numscan.nextInt();
                if (frequencyChoice == 1) {
                    System.out.println("The specific equation for your problem is 'L = 1/4*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 0.25 * lam;
                    } else if (lam == 9.9999) {
                        return L / 0.25;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else if (frequencyChoice == 2) {
                    System.out.println("The specific equation for your problem is 'L = 3/4*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 0.75 * lam;
                    } else if (lam == 9.9999) {
                        return L / 0.75;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else if (frequencyChoice == 3) {
                    System.out.println("The specific equation for your problem is 'L = 5/4*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 1.25 * lam;
                    } else if (lam == 9.9999) {
                        return L / 1.25;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else {
                    return 0.0;
                } // end frequency choice if statement
            } else if (tubeChoice == 3) {
                System.out.println(
                        "Would you like to use the equation for;  \n1. Fundamental Frequency\n2. 1st Overtone \n3. 2nd Overtone\nPlease type in the corresponding number with the choice you want.");
                frequencyChoice = numscan.nextInt();
                if (frequencyChoice == 1) {
                    System.out.println("The specific equation for your problem is 'L = 1/2*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 0.5 * lam;
                    } else if (lam == 9.9999) {
                        return L / 0.5;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else if (frequencyChoice == 2) {
                    System.out.println("The specific equation for your problem is 'L = 2/2*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 1 * lam;
                    } else if (lam == 9.9999) {
                        return L / 1;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else if (frequencyChoice == 3) {
                    System.out.println("The specific equation for your problem is 'L = 3/2*lam'");
                    System.out.println(
                            "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                    System.out.println("For L");
                    L = numscan.nextDouble();

                    System.out.println("For lam");
                    lam = numscan.nextDouble();

                    if (L == 9.9999) {
                        return 1.5 * lam;
                    } else if (lam == 9.9999) {
                        return L / 1.5;
                    } else {
                        return 0.0;
                    } // end solving if statement
                } else {
                    return 0.0;
                } // end frequency choice of statement
            } else {
                return 0.0;
            } // end tube choice if statement
        } else if (varPick == 11121314) {
            System.out.println(
                    "The equation for your problem will either be 'fs = f0(v1/(v1+vs))' or 'fs = fo(v1/(v1-vs))'");
            System.out.println(
                    "Is the source of the sound moving; \n1. Towards the observer \n2.Away from the observer \nPlease type in the corresponding number with the choice you want.");
            int observerChoice;
            observerChoice = numscan.nextInt();
            if (observerChoice == 1) {
                System.out.println("The equaton for your problem is 'fs = fo(v1/(v1-vs))'");
                System.out.println(
                        "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                System.out.println("For fs");
                fs = numscan.nextDouble();

                System.out.println("For fo");
                fo = numscan.nextDouble();

                System.out.println("For v1");
                v1 = numscan.nextDouble();

                System.out.println("For vs");
                vs = numscan.nextDouble();

                if (fo == 9.9999) {
                    return fs * (v1 / (v1 - vs));
                } else if (fs == 9.9999) {
                    return fo / (v1 / (v1 - vs));
                } else {
                    return 0.0;
                } // end if statement
            } else if (observerChoice == 2) {
                System.out.println("The equaton for your problem is 'fs = fo(v1/(v1+vs))'");
                System.out.println(
                        "Now, enter the values for your known variables, and type in the number combination of '9.9999' for the unknown variable.");

                System.out.println("For fs");
                fs = numscan.nextDouble();

                System.out.println("For fo");
                fo = numscan.nextDouble();

                System.out.println("For v1");
                v1 = numscan.nextDouble();

                System.out.println("For vs");
                vs = numscan.nextDouble();

                if (fo == 9.9999) {
                    return fs * (v1 / (v1 + vs));
                } else if (fs == 9.9999) {
                    return fo / (v1 / (v1 + vs));
                } else {
                    return 0.0;
                } // end if statement
            } else {
                return 0.0;
            } // end observer choice if statement
        } else {
            return 0.0;
        } // end big if statement
    }// mechWaves
}// end class
