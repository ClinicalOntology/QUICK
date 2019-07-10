package org.reimagineehr.model.quick.impl.choice;

import org.reimagineehr.model.quick.api.choice.ChoiceElement;
import org.reimagineehr.model.quick.impl.primitive.ElementImpl;

public abstract class ChoiceElementImpl extends ElementImpl implements ChoiceElement {

    private Object choice;

    public boolean isValid() {
        return isNotEmpty();
    }

    public boolean isEmpty() {
        return choice == null;
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public Class<?> getChoiceType() {
        if(isValid()) {
            return choice.getClass();
        } else {
            throw new RuntimeException("No choice has been provided; Cannot infer type.");
        }
    }

    public <T> boolean selectedItemHasType(Class<T> type) {
        if(isValid()) {
            return type.isInstance(choice);
        } else {
            return false;
        }
    }
    public <T> T getChoice(Class<T> choiceClass) {
        return (T) choice;
    }

    public Object getChoice() {
        return choice;
    }

    protected void setChoice(Object choice) {
        this.choice = choice;
    }

}
