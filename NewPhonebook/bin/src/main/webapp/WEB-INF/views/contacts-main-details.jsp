<%@ include file="./header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Contact Details</h1>

<div class="jumbotron">
				<div class="col-md-11 col-sm-11">
					<div class="container">
					<div class="row">
					<div class="col-sm-11">
						<img src="${id.picture}" height="250px" alt="${id.firstname}"><br>
					</div>	
						<div class="col-sm-11">
							<p class="lead">First Name : ${id.firstname}</p>
							<p class="lead">Last Name :${id.lastname}</p>
							<p class="lead">Gender : ${id.gender}</p>
							<p class="lead">Email : ${id.email}</p>
							<p class="lead">Phone : ${id.phone}</p>
							<p class="lead">City : ${id.city}</p>
							<p class="lead">State : ${id.state}</p>
							<p class="lead">Country : ${id.country}</p>
						</div>
						</div>
					</div>
				</div>
		</div>

<%@ include file="./footer.jsp"%>