<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
        <div id="controllers" role="navigation">
            <h2>Lista de Jobs:</h2>
            <ul>
                    <li class="controller">
                        <g:link controller="jobManager" action="start">start</g:link>
                    </li>
                <li class="controller">
                    <g:link controller="jobManager" action="stop">stop</g:link>
                </li>
                <li class="controller">
                    <g:link controller="jobManager" action="novoJob">Novo Job</g:link>
                </li>

            </ul>

        </div>

</body>
</html>
