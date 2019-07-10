package org.reimagineehr.model.quick.impl.choice;

public class N6Choice<A,B,C,D,E,F> extends ChoiceElementImpl {

    public N6Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B,C,D,E,F> N6Choice buildChoice(Class<A> class1, Class<B> class2, Class<C> class3, Class<D> class4, Class<E> class5, Class<F> class6, Object choice) {
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice) || class3.isInstance(choice) || class4.isInstance(choice) || class5.isInstance(choice) || class6.isInstance(choice))) {
            return new N6Choice<A,B,C,D,E,F>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }

}
