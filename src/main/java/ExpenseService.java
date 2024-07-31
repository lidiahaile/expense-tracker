import java.util.List;

public interface ExpenseService {
    List<Expense> getUserExpenses(Long userId);
    Expense saveExpense(Expense expense);

}
