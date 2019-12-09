package ohtu.ts.ui;

import ohtu.ts.domain.Book;
import ohtu.ts.domain.ReadingTip;
import ohtu.ts.io.IO;

public class BookTipUI implements TipUI {

    @Override
    public ReadingTip getTipFromUser(IO io) {
        return new Book(
                io.readOneLine("Otsikko: "),
                io.readOneLine("Kirjoittaja: "),
                io.readOneLine("ISBN: ")
        );
    }
}
