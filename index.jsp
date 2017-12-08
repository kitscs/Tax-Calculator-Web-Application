<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tax Calculator</title>
<link rel="stylesheet" type="text/css" href="taxcalcstyle.css">
</head>

<body>

	<header>
	<h1>State and Federal Tax Calculator</h1>
	</header>

	<div id="pagewrap">

		<section id="summary">
		<p>To use this calculator, first input your gross income. Then
			input any deductions, which may include 401k and HSA. Lastly, pick
			the state you reside in. You will see your state and federal tax
			rates for 2017 based on the applicable IRS tax rates. The calculator
			also outputs your net income after subtracting taxes, as well as the
			total percentage of your gross income that was taken out for taxes.</p>
		</section>

		<main> <section id="content_left">
		<h3>About Us</h3>

		<p>This project is a collaboration between Keith Lounsbury, Tyler
			Lahr, Yousef Ismail, Mahmood Alomari, and Nikita Chunduru</p>
		<p>
			Created for Sophomore Project Fall 2017 at Oakland University<br>
			<br>Professor: Dr. Xiaotong Lin
		</p>
		<aside> <img style="max-width: 100%; height: auto;"
			src="OU_logo.png"></aside> </section> <section id="middle">
		<form action="taxCalculatorServlet" method="post">

			<table>
				<tr>
					<td>Gross income:</td>
					<td><input type="text" name="grossIncome"></td>
				</tr>
				<tr>
					<td>Deductions:</td>
					<td><input type="text" name="deductions"></td>
				</tr>

				<tr>
					<td>State:</td>
					<td><select name="state">
							<option disabled selected value>-- select an option --</option>
							<option value="AL">Alabama</option>
							<option value="AK">Alaska</option>
							<option value="AZ">Arizona</option>
							<option value="AR">Arkansas</option>
							<option value="CA">California</option>
							<option value="CO">Colorado</option>
							<option value="CT">Connecticut</option>
							<option value="DE">Delaware</option>
							<option value="DC">District Of Columbia</option>
							<option value="FL">Florida</option>
							<option value="GA">Georgia</option>
							<option value="HI">Hawaii</option>
							<option value="ID">Idaho</option>
							<option value="IL">Illinois</option>
							<option value="IN">Indiana</option>
							<option value="IA">Iowa</option>
							<option value="KS">Kansas</option>
							<option value="KY">Kentucky</option>
							<option value="LA">Louisiana</option>
							<option value="ME">Maine</option>
							<option value="MD">Maryland</option>
							<option value="MA">Massachusetts</option>
							<option value="MI">Michigan</option>
							<option value="MN">Minnesota</option>
							<option value="MS">Mississippi</option>
							<option value="MO">Missouri</option>
							<option value="MT">Montana</option>
							<option value="NE">Nebraska</option>
							<option value="NV">Nevada</option>
							<option value="NH">New Hampshire</option>
							<option value="NJ">New Jersey</option>
							<option value="NM">New Mexico</option>
							<option value="NY">New York</option>
							<option value="NC">North Carolina</option>
							<option value="ND">North Dakota</option>
							<option value="OH">Ohio</option>
							<option value="OK">Oklahoma</option>
							<option value="OR">Oregon</option>
							<option value="PA">Pennsylvania</option>
							<option value="RI">Rhode Island</option>
							<option value="SC">South Carolina</option>
							<option value="SD">South Dakota</option>
							<option value="TN">Tennessee</option>
							<option value="TX">Texas</option>
							<option value="UT">Utah</option>
							<option value="VT">Vermont</option>
							<option value="VA">Virginia</option>
							<option value="WA">Washington</option>
							<option value="WV">West Virginia</option>
							<option value="WI">Wisconsin</option>
							<option value="WY">Wyoming</option>
					</select>
				</tr>

				<tr>
					<td id="buttons" colspan="2"><input type="submit"
						value="Calculate"> <input type="reset" value="Reset Form"></td>
				</tr>
			</table>
		</form>
		<p>
			<b>Taxable income:</b>
			<%=request.getAttribute("taxableIncome") != null ? request.getAttribute("taxableIncome") : ""%><br>
			<b>State tax:</b>
			<%=request.getAttribute("stateResults") != null ? request.getAttribute("stateResults") : ""%>
			<br> <b>Federal tax:</b>
			<%=request.getAttribute("federalResults") != null ? request.getAttribute("federalResults") : ""%><br>
			<b>FICA:</b>
			<%=request.getAttribute("FICAResults") != null ? request.getAttribute("FICAResults") : ""%><br>
			<b>Net income:</b>
			<%=request.getAttribute("netIncome") != null ? request.getAttribute("netIncome") : ""%><br>
			<b>Total tax percent:</b>
			<%=request.getAttribute("taxPercent") != null ? request.getAttribute("taxPercent") : ""%>
		</p>
		</section> <aside id="content_right">
		<h3>Project Goals</h3>
		<p>This application is designed to help people calculate their net
			income after state and federal taxes.</p>
		<p>It caters to single people filing individually. By inputting
			just their income and deductions, users can see the percent of their
			income that is deducted in taxes.</p>
		</aside> </main>

	</div>
	<footer>
	<p>Keith Lounsbury, Tyler Lahr, Yousef Ismail, Mahmood Alomari,
		Nikita Chunduru &copy 2017</p>
	</footer>
</body>
</html>