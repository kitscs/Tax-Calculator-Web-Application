package ou.secs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ou.secs.tax.FederalTaxCalculator;
import ou.secs.tax.StateTaxCalculator;

/**
 * Servlet implementation class TaxCalculatorServlet
 */
@WebServlet("/taxCalculatorServlet")
public class TaxCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TaxCalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String grossIncome = request.getParameter("grossIncome");
		double inputIncomeDouble = Double.parseDouble(grossIncome);

		String deductions = request.getParameter("deductions");
		double inputDeductionsDouble = Double.parseDouble(deductions);

		String state = request.getParameter("state");

		DecimalFormat moneyDecimalFormat = new DecimalFormat("$###,###.##");
		DecimalFormat percentFormat = new DecimalFormat("##.##%");

		double taxableIncome = inputIncomeDouble - inputDeductionsDouble;

		double calculatedStateTax = StateTaxCalculator.getCalculatedStateTaxAmount(taxableIncome, state);

		double calculatedFederalTax = FederalTaxCalculator.calculateFedTax(taxableIncome);

		double calculatedFICATax = FederalTaxCalculator.calculateFICA(taxableIncome);

		double netIncomeDouble = inputIncomeDouble - (calculatedStateTax + calculatedFederalTax + calculatedFICATax);

		double totalTaxAmt = calculatedStateTax + calculatedFederalTax + calculatedFICATax;

		double totalTaxPercent = (totalTaxAmt / inputIncomeDouble);

		request.setAttribute("taxableIncome", moneyDecimalFormat.format(taxableIncome));
		request.setAttribute("stateResults", moneyDecimalFormat.format(calculatedStateTax));
		request.setAttribute("federalResults", moneyDecimalFormat.format(calculatedFederalTax));
		request.setAttribute("FICAResults", moneyDecimalFormat.format(calculatedFICATax));
		request.setAttribute("netIncome", moneyDecimalFormat.format(netIncomeDouble));
		request.setAttribute("taxPercent", percentFormat.format(totalTaxPercent));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);

	}

}
