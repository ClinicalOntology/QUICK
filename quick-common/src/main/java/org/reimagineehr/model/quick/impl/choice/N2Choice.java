package org.reimagineehr.model.quick.impl.choice;

import java.lang.reflect.ParameterizedType;

public class N2Choice<A,B> extends ChoiceElementImpl {

    public N2Choice(Object choice) {
        setChoice(choice);
    }

    public static <A,B> N2Choice buildChoice(Class<A> class1, Class<B> class2, Object choice) {
        N2Choice<A,B> myChoice = new N2Choice<>(choice);
        Class<A> typeA = (Class<A>) ((ParameterizedType) myChoice.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Class<B> typeB = (Class<B>) ((ParameterizedType) myChoice.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        if(choice != null && (class1.isInstance(choice) || class2.isInstance(choice))) {
            return new N2Choice<A,B>(choice);
        } else if(choice == null) {
            throw new RuntimeException("Choice cannot be null");
        } else {
            throw new RuntimeException("Invalid type for choice argument " + choice.getClass().getName());
        }
    }

}
