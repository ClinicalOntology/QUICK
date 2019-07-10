package org.reimagineehr.model.quick.impl.choice;

public class N7Choice<A,B,C,D,E,F,G> extends ChoiceElementImpl {

    public N7Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B,C,D,E,F,G> N7Choice buildChoice(Class<A> class1, Class<B> class2, Class<C> class3, Class<D> class4, Class<E> class5, Class<F> class6, Class<G> class7, Object choice) {
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice) || class3.isInstance(choice) || class4.isInstance(choice) || class5.isInstance(choice) || class6.isInstance(choice) || class7.isInstance(choice))) {
            return new N7Choice<A,B,C,D,E,F,G>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }

}
