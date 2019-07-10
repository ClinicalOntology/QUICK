package org.reimagineehr.model.quick.impl.choice;

public class N4Choice<A,B,C,D> extends ChoiceElementImpl {

    public N4Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B,C,D> N4Choice buildChoice(Class<A> class1, Class<B> class2, Class<C> class3, Class<D> class4, Object choice) {
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice) || class3.isInstance(choice) || class4.isInstance(choice))) {
            return new N4Choice<A,B,C,D>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }
}
