<%@ include file="./header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Contact List</h1>
<div class="row">

	<!-- list of all products -->
	
		<div class="row">
			<c:forEach items="${contacts}" var="p">
				<div class="col-md-4 col-sm-6">
					<div class="card">
						<a href="./contact-details?id=${p.id}"><img src="${p.picture}" class="card-img-top" alt="${p.firstname}"></a>
						<div class="card-body">
							<h5 class="card-title">${p.firstname}</h5>
							<p class="card-text">${p.lastname}</p>
							<p class="card-text">${p.gender}</p>
							<p class="card-text">${p.email}</p>
							<p class="card-text">${p.phone}</p>
							<p class="card-text">${p.city}</p>
							<p class="card-text">${p.state}</p>
							<p class="card-text">${p.country}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	

</div>


<%@ include file="./footer.jsp"%>