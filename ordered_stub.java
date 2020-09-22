







if (current >= previous) {
                previous = current;
                if (descend == false && ascend == true) {
                    ordered = false;
                    break;
                } else {
                    ascend = true;
                    ordered = true;
                }
                System.out.println("** DEBUG Ascend 0 Values = Previous: " +  previous + " Current: " + current + " Ascened: " + ascend + " Descend: " + descend + " Ordered: " + ordered);
            } else if (current <= previous) {
                previous = current;
                if (ascend == false && descend == true) {
                    System.out.println("DEBUG 2 : ascend = false and ");
                    ordered = false;
                    break;
                } else {
                    descend = true;
                    ordered = true;
                }
                System.out.println("** DEBUG Descend 0 Values = Previous: " +  previous + " Current: " + current + " Ascened: " + ascend + " Descend: " + descend + " Ordered: " + ordered);
            }
        }



 if (ascend == true) {
            System.out.print("Sequence is ascending");
            if (ordered == true) {
                System.out.println(" and ordered.");
            } else {
                System.out.println(" and not ordered.");
            }
        } else if (descend == true) {
            System.out.println("Sequence is descending");
            if (ordered == true) {
                System.out.println(" and ordered.");
            } else {
                System.out.println(" and not ordered.");
            }
        } else {
            System.out.println("DOn't know what your sequence is doing");
        }
doing
