package org.reimagineehr.model.quick.impl.choice;

public class N5Choice<A,B,C,D,E> extends ChoiceElementImpl {

    public N5Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B,C,D,E> N5Choice buildChoice(Class<A> class1, Class<B> class2, Class<C> class3, Class<D> class4, Class<E> class5, Object choice) {
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice) || class3.isInstance(choice) || class4.isInstance(choice) || class5.isInstance(choice))) {
            return new N5Choice<A,B,C,D,E>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }

}
