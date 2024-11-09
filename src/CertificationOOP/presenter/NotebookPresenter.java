package CertificationOOP.presenter;

import CertificationOOP.model.Note;
import CertificationOOP.model.Notebook;
import CertificationOOP.view.NotebookView;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class NotebookPresenter {
    private Notebook model;
    private NotebookView view;

    public NotebookPresenter(Notebook model, NotebookView view) {
        this.model = model;
        this.view = view;
    }

    public void addNote(){
        LocalDateTime dateTime = view.getDateTimeInput();
        String description = view.getDescriptionInput();
        model.add(new Note(dateTime, description));
        view.showMessage("Запись добавлена.");
    }

    public void showNotesForDay(){
        LocalDateTime dateTime = view.getDateTimeInput();
        List<Note> notes = model.getNotesForDay(dateTime);
        view.showNotes(notes);
    }

    public void showNotesForWeek(){
        LocalDateTime startOfWeek = view.getDateTimeInput();
        List<Note>notes=model.getNotesForWeek(startOfWeek);
        view.showNotes(notes);
    }

    public void saveNotes(){
        String fileName = view.getFileNameInput();
        try {
            model.saveToFile(fileName);
            view.showMessage("Записи сохранены в " + fileName);
        } catch (IOException e) {
            view.showMessage("Ошибка сохранения в файл: " + e.getMessage());
        }
    }

    public void loadNotes(){
        String fileName = view.getFileNameInput();
        try {
            model.loadFromFile(fileName);
            view.showMessage("Записи загружены из " + fileName);
        } catch (IOException e) {
            view.showMessage("Ошибка загрузки файла: " + e.getMessage());
        }
    }
}
