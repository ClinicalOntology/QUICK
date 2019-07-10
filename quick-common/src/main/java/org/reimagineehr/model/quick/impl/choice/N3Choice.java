package org.reimagineehr.model.quick.impl.choice;

public class N3Choice<A,B,C> extends ChoiceElementImpl {

    public N3Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B,C> N3Choice buildChoice(Class<A> class1, Class<B> class2, Class<C> class3, Object choice) {
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice) || class3.isInstance(choice))) {
            return new N3Choice<A,B,C>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }
}
