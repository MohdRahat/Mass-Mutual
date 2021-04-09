package pages;

import components.ValuesComponent;

public class ValuesPage extends ValuesComponent {

    ValuesComponent values = new ValuesComponent();

    public void valueRightCount() {

        values.rightCount();
    }

    public void countGreaterThanZero() {

        values.countGreaterThanZero();
    }

    public void totalBalanceIsCorrect() {

        values.totalBalanceIsCorrect();
    }

    public void valuesFormattedAsCurrencies() {

        values.valuesFormattedAsCurrencies();
    }

    public void totalMatchesTheSumAmount() {

        values.totalMatchesTheSumAmount();
    }
}
