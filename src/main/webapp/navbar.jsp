<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
        <a class="navbar-brand" href="Controller">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
            <ul class="navbar-nav mr-auto">
                    <li>
                        <a class="nav-link" href="Controller?command=Overview">Product Overview</a>
                    </li>
                <li>
                    <a class="nav-link" href="Controller?command=OverviewLeeg">Product Overview Leeg</a>
                </li>
            </ul>
        </div>
    </nav>
</header>