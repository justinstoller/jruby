exclude :test_append, "hangs"
exclude :test_append_fail, "hangs"
exclude :test_connection_closed_during_idle, "hangs due to child thread crashing"
exclude :test_connection_closed_without_greeting, "hangs"
exclude :test_disconnect, "hangs"
exclude :test_exception_during_idle, "hangs"
exclude :test_exception_during_shutdown, "hangs"
exclude :test_idle, "hangs"
exclude :test_idle_done_not_during_idle, "hangs"
exclude :test_idle_timeout, "hangs"
exclude :test_imaps_post_connection_check, "Error: closed SSL engine"
exclude :test_send_invalid_number, "hangs"
exclude :test_send_literal, "hangs"
exclude :test_starttls, "hangs"
exclude :test_starttls_stripping, "hangs"
exclude :test_unexpected_bye, "hangs"
exclude :test_unexpected_eof, "hangs"
