package org.reimagineehr.model.quick.impl.choice;

public class N10Choice<A,B,C,D,E,F,G,H,I,J> extends ChoiceElementImpl {

    public N10Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B,C,D,E,F,G,H,I,J> N10Choice buildChoice(Class<A> class1, Class<B> class2, Class<C> class3, Class<D> class4, Class<E> class5, Class<F> class6, Class<G> class7, Class<H> class8, Class<I> class9, Class<J> class10, Object choice) {
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice) || class3.isInstance(choice) || class4.isInstance(choice) || class5.isInstance(choice) || class6.isInstance(choice) || class7.isInstance(choice) || class8.isInstance(choice) || class9.isInstance(choice) || class10.isInstance(choice))) {
            return new N10Choice<A,B,C,D,E,F,G,H,I,J>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }

}
